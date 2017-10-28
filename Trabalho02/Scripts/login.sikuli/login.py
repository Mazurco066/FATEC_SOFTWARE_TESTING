#Iniciando o navegador e acessando a página de login que se deseja testar
click("1509147510293.png");
type("Google Chrome");
type(Key.ENTER);
wait("1509147713937.png");
click("1509147762955.png");
paste("http://localhost/ChuvaInc/ChuWar/");
type(Key.ENTER);
wait("1509148189422.png");

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

