package 도서관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {

	// 데이터베이스에 접근해서 도서등록에 필요한 데이터들을 저장
	public int insert(BookVO vo) {

		int cnt = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			
			// 2) SQL문 준비
			String sql = "insert into book values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			// ?인자 채워주기
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getNum());
			
			
			// 3) 결과값 처리
			cnt = psmt.executeUpdate();	// 영향을 받은 행이 있는지에 대한 결과값
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			// 4) 자원 반납
				try {
					if(psmt != null)
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return cnt; // 데이터베이스 저장 성공여부 결과값 처리는 
		// Controller로 보내주기
	}

	public ArrayList<BookVO> select() {
		
		// executeQuery() ------> ResultSet
		
		BookVO vo = null;
		// 테이블에 있는 책 정보들을 저장하는 가변 배열
		ArrayList<BookVO> bookList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		// 1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			
			// 2) SQL문 준비
			String sql = "select * from book";
			psmt = conn.prepareStatement(sql);
			
			// 3) 결과값 처리
			rs = psmt.executeQuery();	
			// 결과값 ---> rs : 테이블 형태의 데이터를 받아주는 데이터베이스 객체
			
			
			while(rs.next()) {
				// rs.next() : 커서를 한칸씩 움직이면서
				// 데이터가 있는지 없는지 확인해주는 기능(T/F)
				
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);

				vo = new BookVO(title,name,price,num);
				bookList.add(vo);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			// 4) 자원 반납
				try {
					if(rs != null)
						rs.close();
					if(psmt != null)
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return bookList;
	}

	public ArrayList<BookVO> selectOne(BookVO vo) {

		// 테이블에 있는 책 정보들을 저장하는 가변 배열
		ArrayList<BookVO> bookList = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		// 1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 준비물 : 주소, 아이디, 비밀번호
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "shopping";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url,db_id,db_pw);
			
			// 2) SQL문 준비
			String sql = "select * from book where title = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			
			rs = psmt.executeQuery();	
			// 결과값 ---> rs : 테이블 형태의 데이터를 받아주는 데이터베이스 객체
			
			// 3) 결과값 처리
			
			while(rs.next()) {
				// rs.next() : 커서를 한칸씩 움직이면서
				// 데이터가 있는지 없는지 확인해주는 기능(T/F)
			
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String num = rs.getString(4);

				vo = new BookVO(vo.getTitle(),name,price,num);
				bookList.add(vo);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			// 4) 자원 반납
				try {
					if(rs != null)
						rs.close();
					if(psmt != null)
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return bookList;
	}
}
