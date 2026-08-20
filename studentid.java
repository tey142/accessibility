class student{
    student(){}
    student(int id, String name){
        this.id=id;
        this.name=name;
    }
    student(int id, String name, float stipend){
        this.id=id;
        this.name=name;
        this.stipend=stipend;
    }
    void displayDetails(){
        System.out.println(this.id+" | "+this.name+" | "+this.stipend);
    }
}
class studentid{
    public static void main(String[] args){
        student s1=new student();
        student s2=new student(8889, "taylor");
        student s3=new student(9876, "mookie", 7.8);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}