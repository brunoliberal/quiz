package br.ufmg.dcc.rs.quizes.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

import br.ufmg.dcc.rs.quizes.model.Question;

public class QuestionDatabase {

	public static QuestionDatabase instance;
	
	public static QuestionDatabase getInstance() {
		if (instance == null) {
			instance = new QuestionDatabase();
		}
		return instance;
	}
	
	public static void setInstance(QuestionDatabase questionDatabase)
	{
		instance=questionDatabase;
	}

	private List<Question> questions;
	private List<Question> treinodatabase;
	private List<Question> torneiodatabase;

	private Map<String, List<Question>> questionsByCategory;
	
	
	public boolean isInitalized() {
		return this.questions!=null;
	}
	
	public void prepare(List<Question> questions) {
		this.questions=questions;
		//initQuestionsByCategory();
		
	}
	
	public void getQuestionsByCategory() {
		
	}
	
	
	public List<Question> randomizeQuestions(List<Question> questions){
		Collections.shuffle(questions);
		return questions;
	}
	
	public List<Question> getAllQuestions() {
		List<Question> questions = new ArrayList<Question>();
		
		
		//Quiz 2
		questions.add(new Question("Qual é o documento tipicamente produzido na fase Elicitação e Análise de Requisitos?", "Documento de Requisitos", "Relatório de Viabilidade", "Modelos de Sistema", "Todos os anteriores", "Modelos de Sistema", "Categoria", "Tipo"));
		questions.add(new Question("A fase de Validação de Requisitos avalia o documento de requisitos quanto a:", "Realismo", "Consistência", "Completude", "Todos os anteriores", "Todos os anteriores", "Categoria", "Tipo"));
		questions.add(new Question("Um processo de software sempre define, exceto:", "O que é feito", "Quando é feito", "Como é feito", "Quem faz", "Como é feito", "Categoria", "Tipo"));
		questions.add(new Question("As seguintes opções são vantagens de se ter um processo de software, exceto:", "Melhor documentação dos artefatos", "Maior padronização dos artefatos", "Melhor comunicação da equipe", "Menos treinamento de pessoal", "Melhor documentação dos artefatos", "Categoria", "Tipo"));
		questions.add(new Question("As seguintes opções são vantagens do Modelo Cascata, exceto:", "Aderência a outros modelos de processo", "Permite trabalhar melhor o entendimento dos requisitos", "Reflete abordagens adotadas em outras engenharias", "Documentação rígida em cada atividade", "Permite trabalhar melhor o entendimento dos requisitos", "Categoria", "Tipo"));
		questions.add(new Question("Qual das seguintes atividades não aparece no modelo de processo Desenvolvimento Incremental?", "Especificação", "Projeto de arquitetura", "Desenvolvimento", "Validação", "Projeto de arquitetura", "Categoria", "Tipo"));
		
		//Quiz 3
		//Essa questão contém também a resposta: Valorizamos software em funcionamento mais que documentação abrangente.
		questions.add(new Question("Qual das seguintes afirmações não faz parte do manifesto ágil?", "Valorizamos indivíduos e interações mais que processos e ferramentas.", "Valorizamos satisfação do cliente mais que funcionalidade implementada.", "Valorizamos colaboração com o cliente mais que negociação de contratos.", "Valorizamos responder a mudanças mais que seguir um plano.", "Valorizamos satisfação do cliente mais que funcionalidade implementada.", "Categoria", "Tipo"));
		questions.add(new Question("Como são expressos os requisitos de software em Programação Extrema (XP)?", "Histórias do usuário", "Casos de uso", "Tarefas", "Product Backlog", "Histórias do usuário", "Categoria", "Tipo"));
		//Essa questão contém também a resposta: Ritmo sustentável
		questions.add(new Question("Qual das seguintes opções não corresponde a uma prática de Programação Extrema (XP)?", "Planejamento incremental", "Refatoração", "Propriedade coletiva", "Programar para reusar", "Programar para reusar", "Categoria", "Tipo"));
		questions.add(new Question("Qual das seguintes opções não é uma função central do Scrum Master?", "Organizar reuniões diárias", "Registrar decisões", "Resolver impedimentos", "Definir as tarefas prioritárias", "Definir as tarefas prioritárias", "Categoria", "Tipo"));
		questions.add(new Question("Qual das seguintes opções não é um papel de porco segundo a nomenclatura do Scrum?", "Scrum Master", "Team", "Representante do Cliente", "Todos os anteriores são porcos", "Representante do Cliente", "Categoria", "Tipo"));
		questions.add(new Question("Quanto tempo dura cada reunião diária no Scrum?", "15 minutos", "1 hora", "4 horas", "8 horas", "15 minutos", "Categoria", "Tipo"));
		questions.add(new Question("Quanto tempo dura cada reunião de planejamento do sprint no Scrum?", "15 minutos", "1 hora", "4 horas", "8 horas", "8 horas", "Categoria", "Tipo"));
		
		//Quiz 4
		questions.add(new Question("Qual das opções abaixo não é uma característica de requisitos de usuário?", "Descreve as funções e restrições do sistema de forma abstrata", "Devem ser padronizados, completos e consistentes", "Escrito em linguagem natural com diagramas simples", "Ponto de vista das necessidades da empresa cliente", "Devem ser padronizados, completos e consistentes", "Categoria", "Tipo"));
		//Essa questão contém também as respostas: Use linguagem consistente para distinguir entre os requisitos obrigatórios e os desejáveis.
		//										   Invente um formato padrão e garanta que todas as definições de requisitos aderem a esse formato.
		questions.add(new Question("Qual das opções abaixo não é uma diretriz recomendada por Sommerville para minimizar os mal entendidos na redação de requisitos em linguagem natural?", "Use uma forma de destacar as partes fundamentais do requisito.", "Não assuma que os leitores compreendem a linguagem técnica de engenharia de software.", "Sempre que possível, tente associar uma lógica a cada um dos requisitos de usuário.", "Todas as opções acima são diretrizes para redação de requisitos em linguagem natural.", "Todas as opções acima são diretrizes para redação de requisitos em linguagem natural.", "Categoria", "Tipo"));
		questions.add(new Question("Qual das opções abaixo não faz parte da definição de requisitos funcionais?", "Declarações que podem explicitar o que o sistema não deve fazer.", "Declarações de serviços que o sistema deve fornecer.", "Declarações de restrições aos serviços oferecidos pelo sistema.", "Declarações de como o sistema deve reagir a entradas específicas.", "Declarações de restrições aos serviços oferecidos pelo sistema.", "Categoria", "Tipo"));
		questions.add(new Question("Os requisitos não funcionais podem ser provenientes de: I - Características requeridas para o software (requisitos do produto) II - Características da organização que desenvolve o software (requisitos organizacionais) III - Características de outras fontes (requisitos externos) Qual das opções abaixo melhor se aplica a esta classificação de requisitos não funcionais?", "Apenas a opção I é um tipo de requisito não funcional.", "Apenas as opções I e II são tipos de requisitos não funcionais.", "Todas as opções são tipos de requisitos não funcionais.", "Nenhuma das opções se refere a um tipo de requisito não funcional.", "Todas as opções são tipos de requisitos não funcionais.", "Categoria", "Tipo"));
		questions.add(new Question("Sempre que possível, os requisitos não funcionais devem descritos quantitativamente para serem objetivamente testados. Qual das seguintes métricas é indicada no livro texto para medir portabilidade?", "Número de sistemas alvo", "Disponibilidade", "Megabytes", "Uso de máquina virtual", "Número de sistemas alvo", "Categoria", "Tipo"));
		//Essa questão contém também a resposta: Validação de requisitos
		questions.add(new Question("Qual das seguintes opções não é uma das fases principais da engenharia de requisitos?", "Elicitação de requisitos", "Alteração de requisitos", "Estudo de viabilidade", "Especificação de requisitos", "Alteração de requisitos", "Categoria", "Tipo"));
		//Essa questão contém também a resposta: Casos de Uso
		questions.add(new Question("Qual das seguintes opções não é uma técnica de elicitação de requisitos?", "Cenários", "Entrevistas", "Etnografia", "Tabulação", "Tabulação", "Categoria", "Tipo"));
		//Essa questão contém também a resposta: Apenas a opção I é verdadeira.
		questions.add(new Question("Os objetivos da validação de requisitos são: I - Encontrar problemas com os requisitos. II - Demonstrar as funcionalidades do sistema. III - Verificar se os requisitos definem o sistema que o cliente realmente quer. Indique a opção abaixo que melhor se aplica.", "Apenas a opção II é verdadeira.", "Apenas a opção III é verdadeira.", "Apenas duas opções são verdadeiras.", "Todas as opções são verdadeiras.", "Apenas duas opções são verdadeiras.", "Categoria", "Tipo"));
		
		
		//Quiz 1
		//true false
		questions.add(new Question("Software é um programa de computador e a documentação associada.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("Engenharia de Software se preocupa com todos os aspectos do desenvolvimento de sistemas computacionais, incluindo hardware e processo.", "True", "False", "Alternativa", "Alternativa", "False", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("Engenharia de Software é uma disciplina de engenharia que se preocupa com todos os aspectos de produção de software.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("A diferença entre Ciência da Computação e Engenharia de Software é que a primeira foca em teoria e fundamentos enquanto a segunda preocupa-se com o lado prático do desenvolvimento e entrega de software.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("A diferença entre Engenharia de Software e Engenharia de Sistemas é que a primeira se preocupa com todos os aspectos de sistemas computacionais. Assim, Engenharia de Sistemas é parte da Engenharia de Software.", "True", "False", "Alternativa", "Alternativa", "False", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("As principais atividades da Engenharia de Software são especificação, modelagem, testes e evolução.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("Pressman apresenta uma visão da Engenharia de Software em cinco camadas sobrepostas: qualidade, processos de software, métodos de software, ferramentas e pessoas.", "True", "False", "Alternativa", "Alternativa", "False", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("As principais fases da Especificação de Requisitos são estudo de viabilidade, elicitação ou análise de requisitos, especificação de requisitos e validação dos requisitos.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("A lei da Complexidade Crescente de Lehman diz que a medida que um sistema evolui, sua complexidade aumenta, a menos que seja realizado esforço para mantê-la ou diminuí-la.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("Uma das leis de evolução diz que a qualidade de sistemas parecerá estar declinando a menos que eles sejam mantidos e adaptados às modificações do ambiente.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		
		//Quiz 2
		//true false
		questions.add(new Question("Na fase de Análise de Requisitos são usadas várias técnicas baseadas em observação e entrevistas.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("O objetivo do Teste de Componentes é garantir que dois ou mais componentes funcionam juntos.", "True", "False", "Alternativa", "Alternativa", "False", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("A principal vantagem da Prototipação é que ela auxilia o engenheiro de software e o cliente a entenderem melhor o que deve ser construído.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("No Modelo Espiral o software é desenvolvido em versões.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		
		//Quiz 3
		//true false
		questions.add(new Question("Em métodos ágeis, o cliente geralmente paga pelo tempo necessário para o desenvolvimento do sistema, e não pelo desenvolvimento de um determinado conjunto de requisitos.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("Em Programação Extrema (XP), os programadores trabalham em pares e desenvolvem testes antes de escreverem o código.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("O Scrum recomenda o uso de práticas de programação ágil, como programação por pares e desenvolvimento dirigido por testes.", "True", "False", "Alternativa", "Alternativa", "False", "Categoria", "Tipo"));
		
		
		//Quiz 4
		//true false
		questions.add(new Question("Engenharia de Requisitos é o processo de descobrir, analisar, documentar e verificar os serviços que o sistema deve oferecer e as restrições ao seu funcionamento.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
		//true false
		questions.add(new Question("Stakeholders são pessoas que têm qualquer influência direta ou indireta sobre os requisitos, como os usuários finais.", "True", "False", "Alternativa", "Alternativa", "True", "Categoria", "Tipo"));
						
		
		return questions;
	}
	
/*	public void initQuestionsByCategory() {
		questionsByCategory = new HashMap<String, List<Question>>();
		for (Question question : this.questions) {
			List<String> categories = question.getCATEG();
			if (categories!=null){
				for (String category : categories) {
					List<Question> questionByCategoryList = this.questionsByCategory
							.get(category);
					if (questionByCategoryList == null) {
						this.questionsByCategory.put(category,
								new Vector<Question>());
						questionByCategoryList = this.questionsByCategory
								.get(category);
					}
					questionByCategoryList.add(question);
					this.questionsByCategory.put(category, questionByCategoryList);
				}
			}
			
		}
	}
	
	

	
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	
	
	public List<Question> getFilteredQuestions(List<String> categories) {
		
		List<Question> filteredQuestions = new LinkedList<Question>();
		for (Question question:this.questions) {
			boolean match=false;
			for (String category : question.getCategories()) {
				if (categories.contains(category)) {
					match=true;
				}
			}
			if (match) {
				filteredQuestions.add(question);
			}
		}
		
		return filteredQuestions;
	}*/
	

	public List<String> getCategories(){
		 List<String> categories =  new LinkedList<String>();
		 categories.addAll(questionsByCategory.keySet());
		 Collections.sort(categories);
		 return categories;
	}

	
}
