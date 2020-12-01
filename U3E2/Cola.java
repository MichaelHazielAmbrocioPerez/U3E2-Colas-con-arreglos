package u3e2;

public class Cola {
    private Nodo inicio,fin;
    String cola = "";
    
    public Cola(){
        inicio = null;
        fin = null;
    }
    
    public boolean ColaV(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void Insertar(String palabra){
        Nodo nodo = new Nodo();
        nodo.palabra = palabra;
        nodo.siguiente = null;
        
        if (ColaV()) {
            inicio = nodo;
            fin = nodo;
        } else {
            fin.siguiente = nodo;
            fin = nodo;
        }   
    }
    
    public String sacarCola(){
        if (!ColaV()) {
            String palabra = inicio.palabra;
            
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.siguiente;
            }
            return palabra;
        } else {
            return null;
        }
    }
    
    public void mostrarCola(){
        Nodo recorre = inicio;
        String colainv = " ";
        while(recorre != null){
            cola += recorre.palabra + " " ;
            recorre = recorre.siguiente;
        }
        String cadena[] = cola.split(" ");
        
        for (int i = cadena.length -1; i >= 0; i--) {
        colainv += " - "+cadena[i];
        }
          System.out.println(colainv);  
          cola = "";
        
    }
}
