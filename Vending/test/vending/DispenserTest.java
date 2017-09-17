package vending;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Mazurco066
 */
public class DispenserTest {
    
    //TESTES PARA EXCEÇÕES E CONDIÇÕES GERAIS
    
    /**
     * Teste para verificar a exceção de Dinheiro insuficiente para comprar 
     * certo item.
     * 
     * @throws Exception 
     *      - Dinheiro Insuficiente
     */
    @Test(expected = vending.NotEnoughtCreditException.class)
    public void InsufficientMoney() throws Exception{
        
        System.out.println("Teste 01 - Dinheiro Insuficiente");
        
        //Valores
        int centavos = 10;
        int itemDesejado = 3;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
    }
    
    /**
     * Teste para verificar exceção de nenhuma moeda inserida
     * na maquina.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.NoCoinsException.class)
    public void NoCoins() throws Exception{
        
        System.out.println("Teste 02 - Nenhuma moeda inserida");
        
        //Valores
        int centavos = 0;
        int itemDesejado = 3;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
        
    }
    
    /**
     * Teste para verificar Exceção de item selecionado inválido.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.InvalidItemException.class)
    public void InvalidItem() throws Exception{
        
        System.out.println("Teste 03 - Item Inválido");
        
        //Valores
        int centavos = 50;
        int itemDesejado = 21;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
        
    }
    
    /**
     * Teste para verificar a exceção de item fora de estoque.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.UnavailableItemException.class)
    public void UnavaliableItem() throws Exception{
        
        System.out.println("Teste 04 - Item Indisponivel");
        
        //Valores
        int centavos = 50;
        int itemDesejado = 5;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
        
    }
    
    /**
     * Teste para verificar se com dinheiro suficiente a venda do item ocorre
     * normalmente.
     * 
     * @throws Exception 
     */
    @Test
    public void SufficientMoney() throws Exception{
        
        System.out.println("Teste 05 - Dinheiro Suficiente");
        
        //Valores
        int centavos = 50;
        int itemDesejado = 3;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
    }
    
    //TESTES PARA VALORES LIMITE
    
    /**
     * Teste para verificar valor limite negativo.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.InvalidItemException.class)
    public void lowerNegative() throws Exception{
        
        System.out.println("Teste 06 - Valor Limite Inferior -> -1");
        
        //Valores
        int centavos = 50;
        int itemDesejado = -1;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
        
    }
    
    
    /**
     * Teste para verificar valor limite inferior.
     * 
     * @throws Exception 
     */
    @Test
    public void lowerLimit01() throws Exception{
        
        System.out.println("Teste 07 - Valor Limite Inferior -> 1");
        
        //Valores
        int centavos = 50;
        int itemDesejado = 1;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
    }
    
    /**
     * Teste para verificar valor do segundo limite inferior.
     * 
     * @throws Exception 
     */
    @Test
    public void lowerLimit02() throws Exception{
        
        System.out.println("Teste 08 - Valor Limite Inferior -> 2");
        
        //Valores
        int centavos = 50;
        int itemDesejado = 2;
        int resultadoEsperado = 50;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
    }
    
    /**
     * Teste para verificar valor limite superior.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.UnavailableItemException.class)
    public void superiorLimit01() throws Exception{
        
        System.out.println("Teste 09 - Valor Limite Superior -> 19");
        
        //Valores
        int centavos = 200;
        int itemDesejado = 19;
        int resultadoEsperado = 200;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
    }
    
    /**
     * Teste para verificar segundo valor limite superior.
     * 
     * @throws Exception 
     */
    @Test
    public void superiorLimit02() throws Exception{
        
        System.out.println("Teste 10 - Valor Limite Superior -> 20");
        
        //Valores
        int centavos = 200;
        int itemDesejado = 20;
        int resultadoEsperado = 200;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);
        
    }
    
    /**
     * Teste para verificar valor limite superior inválido que seria o estouro
     * indice = 21.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.InvalidItemException.class)
    public void superiorOver() throws Exception{
        
        System.out.println("Teste 11 - Valor Limite Superior -> 21");
        
        //Valores
        int centavos = 200;
        int itemDesejado = 21;
        int resultadoEsperado = 200;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        //Chamando método e checando resultados
        int resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);    
    }
    
    //TESTES ADICIONAIS
    
    /**
     * Teste que simula o estoque da maquina acabando.
     * 
     * @throws Exception 
     */
    @Test(expected = vending.UnavailableItemException.class)
    public void StockOverflow() throws Exception{
        
        System.out.println("Teste 12 - Estouro de Estoque");
        
        //Valores
        int centavos = 1000;
        int itemDesejado = 7;
        int resultadoEsperado = 50;
        int resultado;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        for (int i = 0; i < 10; i++){   //Forçando o estouro do estoque acabando com os 10 items registrados
            
            //Chamando método e checando resultados
            resultado = ds.dispense(centavos, itemDesejado);
            assertEquals(resultado, resultadoEsperado); 
        }
        
        //Chamando método e checando resultados agora com o limite zerado pelo for acima
        resultado = ds.dispense(centavos, itemDesejado);
        assertEquals(resultado, resultadoEsperado);    
        
    }
    
    /**
     * Teste que gasta as moedas ate elas ficarem insuficientes no decimo item
     * é esperado que ao tentar comprar o decimo item ja dispare a exceção
     * de moedas insuficientes
     * 
     * @throws Exception 
     */
    @Test(expected = vending.NotEnoughtCreditException.class)
    public void SpendingCoins() throws Exception{
        
        System.out.println("Teste 13 - Estouro de Moedas");
        
        //Valores
        int centavos = 1900;
        int itemDesejado = 8;
        int resultadoEsperado = 200;
        int resultado;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        for (int i = 0; i < 10; i++){   //Forçando o estouro do estoque acabando com os 10 items registrados
            
            //Chamando método e checando resultados
            resultado = ds.dispense(centavos, itemDesejado);
            assertEquals(resultado, resultadoEsperado);
            centavos -= 200;
        }  
        
    }
    
    /**
     * Teste que gasta as moedas ate elas acabarem no nono item
     * é esperado que ao tentar comprar o decimo item ja dispare a exceção
     * de moedas insuficientes
     * 
     * @throws Exception 
     */
    @Test(expected = vending.NoCoinsException.class)
    public void SpendingCoinsToZero() throws Exception{
        
        System.out.println("Teste 14 - Estouro de Moedas a Zero");
        
        //Valores
        int centavos = 900;
        int itemDesejado = 9;
        int resultadoEsperado = 100;
        int resultado;
        
        //Instanciando objeto
        Dispenser ds = new Dispenser();
        
        for (int i = 0; i < 10; i++){   //Forçando o estouro do estoque acabando com os 10 items registrados
            
            //Chamando método e checando resultados
            resultado = ds.dispense(centavos, itemDesejado);
            assertEquals(resultado, resultadoEsperado);
            centavos -= 100;
        }  
        
    }
    
}
