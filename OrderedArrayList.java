import java.util.ArrayList;

public class OrderedArrayList extends ArrayList{
  //Tasks to do:
  //Make add
  //Make remove
  //Make constructor that makes sure array is sorted in the begininng???????
  
  //instance vars:
  ArrayList<Integer> _data;
  
  public OrderedArrayList() {
    _data = new ArrayList<Integer>(); 
  }
  
  public OrderedArrayList( ArrayList<Integer> list){ 
    _data = list;
    //Automatically sort the array once called
    for (int i=0; i < _data.size() - 1; i++) { // iteriate through _data 
        for (int j = 0; j < _data.size() - 1; j++) { // iteriate through _data for each element of _data
          if (_data.get(j) > _data.get(j+1)) { // if an element is greater than an element to the right of it
            int temp = _data.get(j); // switch the elements' indexes 
            _data.set(j, _data.get(j+1));
            _data.set(j+1, temp); 
          } 
        }
    }
  }
  
 /**
  public OrderedArrayList { Check if sorted
      for (int i=0; i < _data.size() - 1; i++) { // iteriate through _data 
        for (int j = 0; j < _data.size() - 1; j++) { // iteriate through _data for each element of _data
          if (_data[j] > _data[j+1]) { // if an element is greater than an element to the right of it
            int temp = _data[j]; // switch the elements' indexes 
            _data[j] = _data[j+1];
            _data[j+1] = temp; }
        }
      }
  }
  **/
  
  public void add(int newVal){ 
    //determine where newVal belongs.
    for (int i = 0; i < _data.size() -1; i++) {
      if (newVal < _data.get(i)) { //SEEMS okay lets try it!!!
        _data.add(i, newVal);
        return;
      }
    }
      //newVal is bigger than all elements of the array. 
      //Add newVal at the leftmost cell.
      _data.add(newVal);
  }
  
  public static void main (String[] args){
      //System.out.println("Hello World");
      ArrayList<Integer> Faiza = new ArrayList<Integer>(6);
      //System.out.println(Faiza.toString());
      for (int i = 0; i < 23; i++){
            Faiza.add((int) (Math.random() * 101)); // range btwn [0, 100]
        }
      //System.out.println(Faiza.toString());
      OrderedArrayList Huda = new OrderedArrayList(Faiza);
      System.out.println(Faiza.toString());
      Huda.add(20);
      System.out.println(Faiza.toString());
      Huda.remove(2);
      System.out.println(Huda.length());
      System.out.println(Faiza.toString());
  }
}
