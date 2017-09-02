import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTestCase {
	
	@Test
	public void validade01() {	//Primeira Vali��o "a1"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("a1");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate02(){	//Segunda Valida��o "abc"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abc");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate03(){	//Terceira Valida��o "abcdefg"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abcdefg");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate04(){	//Quarta Valida��o "1abc"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("1abc");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate05(){	//Quinta Valida��o "abcde"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abcde");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate06(){	//Sexta Valida��o "abcdef"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abcdef");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate07(){	//S�tima Valida��o "a"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("a");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate08(){	//Oitava Valida��o " "
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier(" ");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate09(){	//Nona Valida��o "ab"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("ab");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate10(){	//Decima Valida��o "#abc"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("#abc");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate11(){	//Decima primeira Valida��o "abc#"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abc#");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate12(){	//Decima segunda Valida��o "null"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("");
		assertEquals(false, obtido);
	}

}
