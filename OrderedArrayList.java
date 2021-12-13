// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
 
  public OrderedArrayList()
  {
	_data = new OrderedArrayList();
  }

  public String toString()
  {
	String ans = "[";
	for (int i; i <_data.size(); i++){
	ans += _data.get(i) + ", ";
	}
	return ans + "]";
  }

  public Integer remove( int i )
  {
	return _data.remove(i);
  }

  public int size()
  {
	return _data.size();
  }

  public Integer get( int i )
  {
	return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
	for (int=0; i < _data.size() - 1; i++) {
	if (newVal < _data.get(i)) {
	_data.add(i, newVal);
	return; }
  	}
  	}

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
	int left = 0;
	int right = _data.length - 1;
	while (left <= right) {
		int mid = left + (right -1) / 2;
		if (_data.get(mid) == newVal) {
			_data.add(mid, newVal);}
		if (_data.get(mid) < newVal) {
			left = mid + 1;}
		else { right = mid - 1;}
		
	}	
		
  }	

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    /*-----v-------move-me-down-----------------v--------

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList

