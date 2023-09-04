package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1.가수명(String) 2.노래제목(String) 3.출시년도(int) 4.시간(int)
		// 노래를 실행, 정지해주는 객체
		MP3Player mp3 = new MP3Player();
		// mp3노래를 실행하기 위해서는 노래가 위치하고 있는 경로가 필요
		//mp3.play("C:\\Users\\gjaischooll\\Desktop\\mp3\\뉴진스-HypeBoy.mp3");
		
		Music m1 = new Music("뉴진스","Hype boy",2022,95,"C:\\Users\\gjaischooll\\Desktop\\mp3\\뉴진스-HypeBoy.mp3");
		Music m2 = new Music("르세라핌","Antifragile",2022,120,"C:\\Users\\gjaischooll\\Desktop\\mp3\\르세라핌-Antifragile.mp3");
		Music m3 = new Music("아이브","LoveDive",2022,78,"C:\\Users\\gjaischooll\\Desktop\\mp3\\아이브-LoveDive.mp3");
		Music m4 = new Music("윤하","사건의지평선",2022,90,"C:\\Users\\gjaischooll\\Desktop\\mp3\\윤하-사건의지평선.mp3");
		Music m5 = new Music("카라","WhenIMove",2022,88,"C:\\Users\\gjaischooll\\Desktop\\mp3\\카라-WhenIMove.mp3");
		//Music m6 = new Music("세븐틴","손오공",2023,82);
		
		ArrayList<Music> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		//list.add(m6);
		
		
		int point = 0;
		
		while(true) {
			System.out.print("1.재생 2.정지 3.이전곡 4.다음곡 5.목록 6.종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("======재생======");
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				
				mp3.play(list.get(point).getPath());
				
				System.out.print((point+1) + ".");
				System.out.print(list.get(point).getSinger() + "-");
				System.out.print(list.get(point).getTitle() + "(" );
				System.out.println(list.get(point).getTime()+"초)");
				
			}else if(menu == 2) {
				System.out.println("======정지======");
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				
				
				System.out.print((point+1) + ".");
				System.out.print(list.get(point).getSinger() + "-");
				System.out.print(list.get(point).getTitle() + "(" );
				System.out.println(list.get(point).getTime()+"초)");
				
			}else if(menu == 3) {
				System.out.println("======이전곡======");

				if(point > 0)
					point--;
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(list.get(point).getPath());
				
				System.out.print((point+1) + ".");
				System.out.print(list.get(point).getSinger() + "-");
				System.out.print(list.get(point).getTitle() + "(" );
				System.out.println(list.get(point).getTime()+"초)");
				
			}else if(menu == 4) {
				System.out.println("======다음곡======");
				// 현재 "1.아이들-퀸카(90초)" 노래가 나온다면 다음곡을 선택할 시
				// "2..."가 출력되게 해주세요
				// 현재 몇 번째 노래가 실행되고 있는지 위치를 알고 있는 변수가 필요
				if(point < list.size()-1)
					point++;
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(list.get(point).getPath());
				
				System.out.print((point+1) + ".");
				System.out.print(list.get(point).getSinger() + "-");
				System.out.print(list.get(point).getTitle() + "(" );
				System.out.println(list.get(point).getTime()+"초)");
				
			}else if(menu == 5) {
				System.out.println("=======목록=======");
				// 1.아이들-퀸카(90초)
				// ..
				
				for(int i = 0; i < list.size(); i++) {
					System.out.print((i+1) + "."+list.get(i).getSinger() + "-" 
							+ list.get(i).getTitle() + "(" + list.get(i).getTime()+"초)");
					System.out.println();
				}
			}else if(menu == 6) {
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				
			}
			
		}
		
		sc.close();
		
		
	}

}
