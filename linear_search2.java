public class linear_search2 {
    public static int findkey(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[]={"prathap","lakshmi","chandi","nithi","manasa","mallu"};
        String key="prathap";
        int index=findkey(menu,key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is found at"+index);
        }
    }
}
