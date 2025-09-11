public class bai7_cacpheptoancoban_bt {
    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1= 2.0;
        double d2= 5.0;
        double d3= -0.5;

        int a= i1 + (i2*i3);
        System.out.println("(a) i1+(i2*i3)= "+ a);
        int b= i1*(i2+i3);
        System.out.println("(b) i1*(i2+i3)= "+ b);
        int c= i1/(i2+i3);
        System.out.println("(c) i1/(i2+i3)= "+ c);
        int e= i1/i2+i3;
        System.out.println("(e) i1/(i2+i3)= "+ e);
        double g= 3+4+(double)5/3;
        System.out.println("(g) 3+4+5/3= "+ g);
        double i= (3+4+5)/3;
        System.out.println("(i) (3+4+5)/3= "+ i);
        double k= d1+(d2*d3);
        System.out.println("(k) d1+(d2*d3)= "+ k);
        double l= d1 +(d2*d3);
        System.out.println("(l) d1+(d2*d3)= "+ l);
        double m= d1/d2 -d3;
        System.out.println("(m) d1/d2-d3= "+ m);
        double n= d1 /(d2*d3);
        System.out.println("(n) d1 /(d2*d3)= "+ n);
        double o= d1 + d2 + d3/3;
        System.out.println("(o) d1 + d2 + d3/3= "+ o);
        double p= (d1 + d2 + d3)/3;
        System.out.println("(p) (d1 + d2 + d3)/3= "+ p);
        double q= d1+ d2 +(d3/3);
        System.out.println("(q) d1+d2+(d3)/3= "+ q);
        double r= 3*(d1+d2)*(d1-d3);
        System.out.println("(r) 3*(d1+d2)*(d1-d3)= "+ r);
    }
}
