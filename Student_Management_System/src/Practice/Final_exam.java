package Practice;
import a.SuperClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Final_exam implements Comparable<FinalExam>{

	   public int compareTo(FinalExam o) {
	      return this.nClassNum - o.nClassNum;
	   }
	}

	public class FinalExam extends SuperClass implements Comparable<FinalExam>{
	   
	   private ArrayList<String> arraylist;
	   
	   public FinalExam() {
	      this.nClassNum = 1;
	   }
	   
	   public FinalExam(String id, String name, int nClassNum) {
	      this.id = id;
	      this.name = name;
	      this.nClassNum = nClassNum;
	   }
	   
	   
	   
	   public static void main(String[] args) {
	      FinalExam my_final = new FinalExam("16422034", "박지용", 1);
	      
	      System.out.println(my_final.getName());
	      System.out.println(my_final.getId());
	      
	      System.out.println(my_final.FindHyunjun("박헌준박현춘박현츈박현준박현주박현준박현준박현조벅현주박혀주박휴주~~~") + "개");

	      System.out.println("34라인에 sort오류를 해결 못했습니다.");
	      
	      FinalExam finals[] = new FinalExam[10];
	      Arrays.sort(finals);
	   }
	   
	   public String getName() {
	      return super.name;
	   }
	   
	   public String getId() {
	      return super.id;
	   }

	   // 2번 박현준찾기 메소드
	   public int FindHyunjun(String in) {
	      int count = 0;
	      
	      while( in.contains("박현준") ) {
	         count++;
	         in = in.substring( in.indexOf("박현준") + 3 );
	      }
	      return count;
	   }

	   
	   //3번 CompareTo 메소드
	   public int compareTo(FinalExam o) {
	      return this.nClassNum - o.nClassNum;
	   }
	   
	   
	   //여기부터 4번
	   public void addData(String s) {
	      this.arraylist.add(s);
	   }
	   
	   public void removeData(String s) {
	      this.arraylist.remove((String)s);
	   }
	   
	   public void sortData() {
	      Collections.sort(arraylist);
	   }
	   
	   public boolean isContains(String s) {
	      return this.arraylist.contains(s);
	   }
	   
	   public String getData(int n) {
	      return this.arraylist.get(n);
	   }
	   
	}