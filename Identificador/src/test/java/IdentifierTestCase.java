import static org.junit.Assert.*;
import org.junit.Test;

public class IdentifierTestCase {
	
	@Test
	public void validade01() {	//Primeira Valição "a1"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("a1");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate02(){	//Segunda Validação "abc"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abc");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate03(){	//Terceira Validação "abcdefg"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abcdefg");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate04(){	//Quarta Validação "1abc"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("1abc");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate05(){	//Quinta Validação "abcde"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abcde");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate06(){	//Sexta Validação "abcdef"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abcdef");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate07(){	//Sétima Validação "a"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("a");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate08(){	//Oitava Validação " "
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier(" ");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate09(){	//Nona Validação "ab"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("ab");
		assertEquals(true, obtido);
	}
	
	@Test
	public void validate10(){	//Decima Validação "#abc"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("#abc");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate11(){	//Decima primeira Validação "abc#"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("abc#");
		assertEquals(false, obtido);
	}
	
	@Test
	public void validate12(){	//Decima segunda Validação "null"
		
		Identifier id = new Identifier();
		boolean obtido;
		obtido = id.validateIdentifier("");
		assertEquals(false, obtido);
	}

}
