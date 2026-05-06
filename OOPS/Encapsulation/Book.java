package OOPS.Encapsulation;

public class Book {
    private int pageNum ;
    public void getData(int x){
        if(x > 0){
            pageNum = x;
        }
    }
    public void setData(){
        System.out.println(pageNum);
    }
}
