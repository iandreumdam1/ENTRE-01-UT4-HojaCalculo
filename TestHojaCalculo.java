
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Ibai Andreu  
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
        
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
           HojaCalculo test = new HojaCalculo("HOJA1");
           test.addFila("Fila1", new Fecha(4,10,2020), 25.50, 132);
           test.addFila("Fila2", new Fecha(4,10,2020), 300, 350);
           test.addFila("Fila3", new Fecha(1,1,2020), 0, 0);
           test.addFila("Fila4", new Fecha(1,1,2020), 0, 0);
           System.out.println(test.toString());
           System.out.println(test.duplicarHoja());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
         HojaCalculo test = new HojaCalculo("HOJA2");
         test.addFila("Fila1", new Fecha(7,10,2020), 260, 125);
         test.addFila("Fila2", new Fecha(8,10,2020), 125, 245);
         System.out.println(test.toString());
         System.out.println(test.duplicarHoja());

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
         HojaCalculo test = new HojaCalculo("HOJA3");
         test.addFila("Fila1", new Fecha(8,10,2020), 670, 234);
         System.out.println(test.toString());
         System.out.println(test.duplicarHoja());

    }

}
