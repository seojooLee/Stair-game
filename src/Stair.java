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

 	/*���� ���� 

 	 * ���������� ��� �������� 

 	 * -----------------------------------

 	 * ����:2ĭ, ����:1ĭ, ��:3ĭ

 	 * --------------------------------

 	 * ���ϸ��� �������� ����� �̱� 

 	 * ù��° ��� you �ι�° ��� com

 	 * ���ÿ��� �������� 

 	 * �����:�� ��ǻ��:��*/

 	

 	

 	while(true) {//count<1  

    System.out.println("[you]");

    for(i = 0; i<line; i++){//youup

    	for(j = 0; j<i;j++){ 

    		  for (j = 0; j< i; j++) { 

            System.out.print("����");

        }

    		System.out.print("");

    	}

    	  for ( b  = 0; b <youup; b++) //youup��ŭ �ݺ�  37�ٺ��� 44���� ��� ���鿡 ��ħ

          {

              if (b == i)               

                 System.out.print("��"); //line ���� ������ �����     

              else                       

                  System.out.print(" "); //line ���� �ٸ��� ������ ����Ѵ�.          

          }

          System.out.println("");   

          }

    System.out.println(" ");

     

 System.out.println("[com]");

          for(i = 0; i<line; i++){//comup

    	  for(j = 0; j<i;j++){ 

    	  for (j = 0; j< i; j++) {

            System.out.print("����");//com�� ���

        }

    		System.out.print("");

    	}

    	  for ( a= 0; a <comup; a++)    //comup��ŭ �ݺ� 56�ٺ��� 61���� ��� ���鿡 �밢�� �ڵ� ��ħ

          {

              if (a == i)               // line ����  ������  �� ���

                 System.out.print("��");           

              else                      // line  ���� �ٸ� �� ���� ���

                  System.out.print(" ");          

          }

          System.out.println("");  

          

          }

 			 com1 =(int)(Math.random() * 3)+1;

		 	System.out.print("�Է� (1.����, 2.����, 3.��) : ");

		 	you = sc.nextInt(); 

		switch (com1){

		case 1:

			System.out.print("��ǻ�� : ����, \t");

			break; 

		case 2:

			System.out.print("��ǻ��: ����,  \t");

			break;

		case 3:

			System.out.print("��ǻ�� : ��, \t");

			break;

		}

		//����� ����

		switch (you) {

		case 1:

			System.out.println("��� : ����. \t");break;	 

		case 2:

			System.out.println("���: ����.  \t");break;

		case 3:

			System.out.println("��� : ��. \t");break;

		default:

			System.out.println("�߸��� �����Դϴ�.\n\n"); 

		}//while

 

 		count++;//while���� 1���� 10���� �ݺ��ؾ� �����Ƿ� ���������ڸ� �̿��ؼ� 10�� �ɰ�� while�� ����

 	//	i+=1;//�ϳ��� ������� �����ϰ�  i�� 1�� �ѹ��ݺ��Ҷ����� �����ֹǷ� �ε��� ���� �ϳ��� ��������

	 		 	if (you == 1 && com1 == 3){//you�� �̱涧  ����

	 		 		youup+=2;//37���ٿ� ��ŭ �������� ���� ���

	 		 		youtotal+=two;//youtotal�� ���� line����ŭ ����������츦 ���� ��

					System.out.println("you:"+two+"ĭ");

	 		 	}

	 		 	else if (you == 2 && com1 == 1){//����

	 		 		  youup+=1;//37���ٿ� ��ŭ �������� ���� ���

		 		 		youtotal+=one;

 

	 					System.out.println("you:"+one+"ĭ");

	 		 	}

	 		 	else if (you == 3 && com1 == 2){//��

	 		 		youup+=3;//37���ٿ� ��ŭ �������� ���� ���

	 		 		youtotal+=three; 

					System.out.println("you:"+three+"ĭ");

	 		 	}

 			  

			if (you == 1 &&  com1 == 2){//��ǻ�Ͱ� �̱涧 ����

				comup+=1;

  				total+=one;

 				System.out.println("com:"+one+"ĭ");

			}

			else if (you == 2 && com1 == 3){//��

				comup+=3;

 				total+=three;

				System.out.println("com:"+three+"ĭ");

			}

			else if((you == 3 && com1 == 1)){//����

				comup+=2; 

 				total+=two;

 				System.out.println("com:"+two+"ĭ");	 

 

			} 

			if(total>=8){//��ǻ�Ͱ� 8��ŭ(��� ����ŭ) ���������� �̱��� ǥ�� 

				 System.out.println("��ǻ�Ͱ� ���������� �̰���ϴ�.");

				 break;//while�� ����

			}

			else if(youtotal>=8){//you�� �������������� �̱��� ǥ�� 

				System.out.println("����� ���������� �̰���ϴ�.");

				break;//while�� ����

			}

 

	 	  }//while 

	}

}//main