
package cola;


public class Cola {
    private int[] arreglo;
    private int front;
    private int back;
    private int count;
    
    
    public boolean full(){
        return count== this.arreglo.length;
    }
    
     public boolean empty(){
        return count == 0;
    }
    
    public int desencolar(){
        if(empty()){
            throw new IllegalArgumentException("Esta vacio pa");          
        }
        int e = this.arreglo[front];
        int n = this.arreglo.length;
        front = (front+1)%n; //Hacemos la cola circular
        count --;
        return e;
        
    
    }
    
    public void encolar(int e){
        if(full()){
            throw new IllegalArgumentException("Esta lleno pa"); 
        }
        this.arreglo[this.back] = e;
        int n = this.arreglo.length;
        back = (back + 1)%n;
        count++;
    }
    
    public Cola(){
        this(5);
    }
    public Cola(int n){
        this.arreglo = new int[n];
        this.front = 0;
        this.back = 0;
        this.count = 0;
    }
    
    public String toString(){
        String cad = "[";
        for(int x: this.arreglo){
            cad+=x + " ";
        }
        cad += "]";
        return cad;
    }
    
    public static void main(String[] args) {
        Cola cola = new Cola(3);
        cola.encolar(1);
        System.out.println(cola.toString());
        cola.encolar(2);
        System.out.println(cola.toString());
        cola.encolar(3);
        System.out.println(cola.toString());
        int i = cola.desencolar();
        System.out.println(i);
        cola.encolar(4);
        System.out.println(cola.toString());
        i = cola.desencolar();
        System.out.println(i);
        cola.encolar(5);
        System.out.println(cola.toString());
        i = cola.desencolar();
        System.out.println(i);
        cola.encolar(6);
        System.out.println(cola.toString());
         i = cola.desencolar();
        System.out.println(i);
         i = cola.desencolar();
        System.out.println(i);
         i = cola.desencolar();
        System.out.println(i);
         i = cola.desencolar();
        System.out.println(i);
    }
    
}
