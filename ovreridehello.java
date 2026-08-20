class parent{
    void sayhi(){
        System.out.println("hi from parent");
    }
}
class child extends parent{
    @Override
    void sayhi(){
        System.out.println("hi from child");
    }
}
class ovreridehello{
    public static void main(String[] args){
        parent child=new child();
        //parent parent=new parent;
        child.sayhi();
    }
}