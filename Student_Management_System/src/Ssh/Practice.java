package Ssh;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

        //1.�迭����           

        String[] names = new String[3];

        int size = names.length;
          //2.�Է¹ޱ�

        Scanner put = new Scanner(System.in);
          //3.�Էµ� �̸��� �迭�� ������ �°� ����

        for(int i=0; i<size; i++){

        System.out.print("�̸��� �Է��ϼ���. ");

         names[i] = put.next();            

        }
          for(int i=0; i<size; i++){

    //4.ȭ�鿡 �Էµ� �̸��� ǥ���Ѵ�.

        System.out.println("�̸�: " +names[i]);

    }

    }



	}


