public class baitapphuongtrinhbac2 {
    public static void main(String[] args) {
        QuadraticEquation n = new QuadraticEquation(3, 8, 5);
        if (n.getA() == 0){
            if(n.getB()==0){
                System.out.println("phuong trinh vo nghiem");
            }
            else {
                System.out.println("pt cos 1 nghiem  la r ="+(-n.getC()/n.getB()));
            }
        }
else
if (n.getDiscriminant()<0){
    System.out.println("pt vo nghiem");
}else
    if (n.getDiscriminant()==0){
        System.out.println("pt co nghiem kep r1 =r2 ="+n.getRoot1());
    }
    else
        if (n.getDiscriminant()>0){
            System.out.println("nghiem thu nhat r1="+n.getRoot1()+"nghiem thu2 r2="+n.getRoot2());
        }
    }
}

