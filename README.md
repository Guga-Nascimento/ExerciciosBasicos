# ExerciciosBasicos
**Nessa sessão de exercícios, comecei realizando exercícios de lógica simples. 
No exercício 5, decidi implementar o paradigma de programação orientada 
a objetos (OOP). A OOP é um estilo de programação que organiza o código 
em objetos, os quais têm propriedades (atributos) e comportamentos (métodos).

**Ao aplicar a OOP no exercício 5, comecei a criar classes e objetos para 
representar os conceitos relacionados ao problema. Essa abordagem ajuda 
a estruturar o código de forma mais clara e modular, facilitando a
compreensão e manutenção.

**Já no exercício MainAreas(CalculoAreas), a implementação da OOP foi feita de maneira excelente. 
Na classe principal (também conhecida como "main"), instanciei um objeto e 
chamei os métodos necessários. Isso demonstra que você está compreendendo 
e aplicando cada vez mais os conceitos da OOP de forma organizada e com 
facilidade de manutenção.

**A OOP é uma abordagem poderosa para a programação, pois permite a criação 
de código mais legível, reutilizável e modular. Além disso, facilita a colaboração 
entre desenvolvedores, pois o código se torna mais intuitivo e estruturado.

**Ao continuar praticando a programação orientada a objetos, você estará no 
caminho certo para se tornar um programador mais habilidoso e capaz de lidar
 com projetos complexos de forma eficiente. É importante lembrar de sempre 
 praticar e explorar mais sobre os conceitos da OOP, pois essa é uma área 
 fundamental no desenvolvimento de software.
 
 ## mostrando que onde roda o programa apenas criei um objeto e chamei todos os métodos necessarios
 ```java
 public class MainAreas{
	
	public static void main(String[] args) {			
		CalculoAreas obj = new CalculoAreas(0, 0, 0);
		obj.dadosRecebidos();
		obj.triangulo();
		obj.circulo();
		obj.trapazio();
		obj.quadrado();
		obj.retangulo();	
	}

} 
```
