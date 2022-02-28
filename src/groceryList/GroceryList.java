package groceryList;

//TODO:
//1. addGroceryItem
//2. printGroceryList
//3. removeGroceryItem
//4. modifyGroceryItem

import java.util.ArrayList;

public class GroceryList {
    //Fields
    private ArrayList<String> groceryList = new ArrayList<String>();

    //Methods
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1)+". " + groceryList.get(i));
        }
    }

    public void removeGroceryItem(String item){
       int position = findItem(item);
       if (position >= 0){
           removeGroceryItem(position);
       }
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1)  + " has been modified.");
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }else{
            return false;
        }
    }
}
