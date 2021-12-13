import java.util.ArrayList;

public class ALTester{

	static void isSorted(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            //int element = list.get(i);
            int nextElement = list.get(i+1);
            int result = list.get(i).compareTo(list.get(i+1));
            if (result > 0){
                System.out.println("The array isn't sorted at the index: " + (i + 1) + " which has the value of " + nextElement);
                return;
            }
        }
        System.out.println("This array is indeed sorted!");
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> _data = new ArrayList<Integer>();
        for (int i = 0; i < 23; i++){
            _data.add((int) (Math.random() * 101)); // range btwn [0, 100]
        }
        System.out.println("Array being tested: " + _data.toString());
        //System.out.println(_data.size());
        isSorted(_data);
    }
}
