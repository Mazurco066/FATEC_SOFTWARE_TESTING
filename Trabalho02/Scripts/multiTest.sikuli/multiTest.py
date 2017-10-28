#Iniciando o navegador e acessando a página de login que se deseja testar
click("1509147510293.png");
type("Google Chrome");
type(Key.ENTER);
wait("1509147713937.png");
click("1509147762955.png");
paste("http://localhost/ChuvaInc/ChuWar/");
type(Key.ENTER);
wait("1509148189422.png");

#Criando Menu de Seleção de Testes
opcoes = ('1', '2');
escolha = select("Escolha 1 para teste de Login ou 2 para teste de Registro: ", options = opcoes);

if escolha == opcoes[0]:

    #Página Carregada - Testando para campos vazios
    click("1509148329279.png");
    wait("1509148516450.png");
    
    #Testando para entrada somente de usuário
    click("1509148792209.png");
    type("Teste01");
    click("1509148329279.png");
    wait("1509148516450.png");
    
    #Testando para usuário correto e senha errada
    click("1509148792209.png");
    type("Teste01");
    type(Key.TAB);
    type("senhaerrada");
    click("1509148329279.png");
    wait("1509150616345.png");
    
    #Testando com usuário correto e senha correta
    click("1509148792209.png");
    type("Teste01");
    type(Key.TAB);
    type("123456789");
    click("1509148329279.png");
    wait("1509150691340.png");
    click("1509150702770.png");
    popup("Teste de Login Concluido com Sucesso!");

else:
    
    #Página Carregada - Testando com Campos Vazios
    click("1509151729549.png");
    click("1509151929229.png");
    wait("1509151945935.png");

    #Testando com Entrada somente de Username
    click("1509152202418.png");
    type("Sikuli01");
    click("1509151929229.png");
    wait("1509151945935.png");

    #Testando com entrada somente de Username e Nome
    click("1509152202418.png");
    type("Sikuli01");
    type(Key.TAB);
    type("Sikuli");
    click("1509151929229.png");
    wait("1509151945935.png");

    #Testando somente com entrada de Nome
    click("1509152448748.png");
    type("Sikuli");
    click("1509151929229.png");
    wait("1509151945935.png");

    #Testando somente com entrada de Senha
    click("1509152553548.png");
    type("123456789");
    click("1509151929229.png");
    wait("1509151945935.png");

    #Testando com entrada de Nome e Senha
    click("1509152448748.png");
    type("Sikuli");
    type(Key.TAB);
    type("123456789");
    click("1509151929229.png");
    wait("1509151945935.png");

    #Testando com entrada de Usuario, Nome e Senha Muito Curta
    click("1509152202418.png");
    type("Sikuli01");
    type(Key.TAB);
    type("Sikuli");
    type(Key.TAB);
    type("1234567");
    click("1509151929229.png");
    wait("1509152734618.png");

    #Testando com Usuário, Nome e Senha Corretamente
    click("1509152202418.png");
    type("Sikuli01");
    type(Key.TAB);
    type("Sikuli");
    type(Key.TAB);
    type("123456789");
    click("1509151929229.png");
    wait("1509152792694.png");
    popup("Teste de Registro Concluido com Sucesso!");
    