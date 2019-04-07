import java.util.Scanner;

public class Stair {
 
	public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

  int com1, you; 

 	int count=0, total = 0,youtotal = 0; 

 	int up=0;

 	int comup = 0;

  	int one = 1;

 	int two = 2;

 	int three = 3;

 	int line=8;

 	int a,b = 0;

 	int i, j, youup = 0;

 	System.out.println();

 	/*게임 설명 

 	 * 가위바위보 계단 내려가기 

 	 * -----------------------------------

 	 * 가위:2칸, 바위:1칸, 보:3칸

 	 * --------------------------------

 	 * 제일먼저 내려오는 사람이 이김 

 	 * 첫번째 계단 you 두번째 계단 com

 	 * 비길시에는 변동없음 

 	 * 사용자:□ 컴퓨터:○*/

 	

 	

 	while(true) {//count<1  

    System.out.println("[you]");

    for(i = 0; i<line; i++){//youup

    	for(j = 0; j<i;j++){ 

    		  for (j = 0; j< i; j++) { 

            System.out.print("■■■");

        }

    		System.out.print("");

    	}

    	  for ( b  = 0; b <youup; b++) //youup만큼 반복  37줄부터 44번줄 계단 공백에 합침

          {

              if (b == i)               

                 System.out.print("□"); //line 수와 같을때 별출력     

              else                       

                  System.out.print(" "); //line 수와 다를때 공백을 출력한다.          

          }

          System.out.println("");   

          }

    System.out.println(" ");

     

 System.out.println("[com]");

          for(i = 0; i<line; i++){//comup

    	  for(j = 0; j<i;j++){ 

    	  for (j = 0; j< i; j++) {

            System.out.print("■■■");//com의 계단

        }

    		System.out.print("");

    	}

    	  for ( a= 0; a <comup; a++)    //comup만큼 반복 56줄부터 61번줄 계단 공백에 대각선 코드 합침

          {

              if (a == i)               // line 수와  같을때  별 출력

                 System.out.print("○");           

              else                      // line  수와 다를 때 공백 출력

                  System.out.print(" ");          

          }

          System.out.println("");  

          

          }

 			 com1 =(int)(Math.random() * 3)+1;

		 	System.out.print("입력 (1.가위, 2.바위, 3.보) : ");

		 	you = sc.nextInt(); 

		switch (com1){

		case 1:

			System.out.print("컴퓨터 : 가위, \t");

			break; 

		case 2:

			System.out.print("컴퓨터: 바위,  \t");

			break;

		case 3:

			System.out.print("컴퓨터 : 보, \t");

			break;

		}

		//당신의 선택

		switch (you) {

		case 1:

			System.out.println("당신 : 가위. \t");break;	 

		case 2:

			System.out.println("당신: 바위.  \t");break;

		case 3:

			System.out.println("당신 : 보. \t");break;

		default:

			System.out.println("잘못된 숫자입니다.\n\n"); 

		}//while

 

 		count++;//while문이 1부터 10까지 반복해야 끝나므로 증감연산자를 이용해서 10이 될경우 while문 종료

 	//	i+=1;//하나의 결과문을 실행하고  i는 1을 한번반복할때마다 더해주므로 인덱스 수를 하나씩 증가해줌

	 		 	if (you == 1 && com1 == 3){//you가 이길때  가위

	 		 		youup+=2;//37번줄에 얼만큼 내려갈지 수를 출력

	 		 		youtotal+=two;//youtotal이 만약 line수만큼 내려왔을경우를 위한 식

					System.out.println("you:"+two+"칸");

	 		 	}

	 		 	else if (you == 2 && com1 == 1){//바위

	 		 		  youup+=1;//37번줄에 얼만큼 내려갈지 수를 출력

		 		 		youtotal+=one;

 

	 					System.out.println("you:"+one+"칸");

	 		 	}

	 		 	else if (you == 3 && com1 == 2){//보

	 		 		youup+=3;//37번줄에 얼만큼 내려갈지 수를 출력

	 		 		youtotal+=three; 

					System.out.println("you:"+three+"칸");

	 		 	}

 			  

			if (you == 1 &&  com1 == 2){//컴퓨터가 이길때 바위

				comup+=1;

  				total+=one;

 				System.out.println("com:"+one+"칸");

			}

			else if (you == 2 && com1 == 3){//보

				comup+=3;

 				total+=three;

				System.out.println("com:"+three+"칸");

			}

			else if((you == 3 && com1 == 1)){//가위

				comup+=2; 

 				total+=two;

 				System.out.println("com:"+two+"칸");	 

 

			} 

			if(total>=8){//컴퓨터가 8만큼(계단 수만큼) 내려왔을때 이김을 표시 

				 System.out.println("컴퓨터가 먼저내려와 이겼습니다.");

				 break;//while문 종료

			}

			else if(youtotal>=8){//you가 먼저내려왔을때 이김을 표시 

				System.out.println("당신이 먼저내려와 이겼습니다.");

				break;//while문 종료

			}

 

	 	  }//while 

	}

}//main