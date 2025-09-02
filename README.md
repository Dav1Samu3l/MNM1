# 🚗 Sistema de Gerenciamento de Veículos

## 📋 Índice
- Descrição do Projeto
- Diagrama de Classes
- Funcionalidades
- Tecnologias e Conceitos
- Estrutura do Projeto
- Como Executar
- Classes e Modelos
- Padrão MVC
- Exemplos de Uso

---

## 🎯 Descrição do Projeto
Sistema completo de gerenciamento de veículos, clientes e modelos desenvolvido em **Java** seguindo o padrão **MVC (Model-View-Controller)**.  
O sistema permite cadastrar e gerenciar veículos, clientes, modelos, marcas e cores, com associações complexas entre as entidades.

---

## 📊 Diagrama de Classes
<img width="236" height="404" alt="image" src="https://github.com/user-attachments/assets/79b8af93-1897-4f71-ad56-f9b26930c618" />


**Multiplicidades:**
- 1 Cliente pode ter N Veículos  
- 1 Veículo pertence a 1 Cliente  
- 1 Veículo tem 1 Modelo  
- 1 Veículo tem 1 Cor  
- 1 Modelo pertence a 1 Marca  
- 1 Modelo tem 1 Motor (composição)  

---

## ⚙️ Funcionalidades

### ✅ Funcionalidades Implementadas
- Cadastro de Veículos com placa, observações e associações  
- Gestão de Clientes com dados completos e veículos vinculados  
- Catálogo de Modelos com marcas, categorias e motores  
- Sistema de Cores para personalização de veículos  
- Associações Bidirecionais entre todas as entidades  
- Interface de Console interativa  
- Busca e Listagem de veículos por placa  
- Relatórios Detalhados com informações completas  

### 📋 Menu Principal
- 📋 Listar todos os veículos  
- 🔍 Buscar veículo por placa  
- 📊 Exibir detalhes de um veículo  
- 👥 Listar clientes  
- 🚙 Listar modelos disponíveis  
- 🚪 Sair  

---

## 🛠️ Tecnologias e Conceitos

### 🎯 Conceitos de POO Aplicados
- **Encapsulamento** – Atributos privados com getters/setters  
- **Herança** – Estrutura hierárquica das classes  
- **Polimorfismo** – Sobrescrita de métodos `toString()`  
- **Abstração** – Classes bem definidas com responsabilidades únicas  

### 🔗 Tipos de Associação
- **Bidirecional**: Veículo ↔ Cliente  
- **Unidirecional**: Veículo → Modelo, Veículo → Cor, Modelo → Marca  
- **Composição**: Modelo ⊗ Motor (Motor não existe sem Modelo)  

### 🏷️ Enums Utilizados
ECategoria { PEQUENO, MEDIO, GRANDE, MOTO, PADRAO }  
ETipoCombustivel { GASOLINA, ETANOL, FLEX, DIESEL, GNV, OUTRO }  

---

## 📁 Estrutura do Projeto
<img width="409" height="480" alt="image" src="https://github.com/user-attachments/assets/67992b29-e5e6-42c9-a655-d3ba36252e05" />

---

## 🚀 Como Executar

### Pré-requisitos
- ✅ Java JDK 8 ou superior  
- ✅ IDE Java (IntelliJ, Eclipse, VSCode) ou terminal  

### 📥 Compilação e Execução

**Opção 1: Via IDE**  
1. Clone ou baixe o projeto  
2. Importe na sua IDE Java favorita  
3. Execute a classe `Main.java`  

**Opção 2: Via Terminal**  
Compilar todos os arquivos:  
javac -d bin src/com/mycompany/maonamassa3/*.java \  
           src/com/mycompany/maonamassa3/controller/*.java \  
           src/com/mycompany/maonamassa3/model/*.java \  
           src/com/mycompany/maonamassa3/model/enums/*.java \  
           src/com/mycompany/maonamassa3/view/*.java  

Executar o programa:  
java -cp bin com.mycompany.maonamassa3.Main  



---

## 🏗️ Classes e Modelos

### 🧍 Cliente
- id: int  
- nome: String  
- celular: String  
- email: String  
- dataCadastro: LocalDate  
- veiculos: List<Veiculo>  

### 🚗 Veiculo
- id: int  
- placa: String  
- observacoes: String  
- cliente: Cliente  
- modelo: Modelo  
- cor: Cor  

### 🚙 Modelo
- id: int  
- descricao: String  
- marca: Marca  
- motor: Motor (composição)  
- categoria: ECategoria  

### 🏭 Marca
- id: int  
- nome: String  

### 🔧 Motor
- potencia: int  
- tipoCombustivel: ETipoCombustivel  

### 🎨 Cor
- id: int  
- nome: String  

---

## 🏗️ Padrão MVC

### 📦 Model (Modelo)
Responsabilidade: Representar os dados e a lógica de negócio  
Inclui: Cliente, Veiculo, Modelo, Marca, Motor, Cor, Enums ECategoria e ETipoCombustivel  

### 🎮 Controller (Controlador)
Responsabilidade: Intermediário entre View e Model  
Inclui: VeiculoController – Gerencia toda a lógica de aplicação  

### 👀 View (Visualização)
Responsabilidade: Interface com o usuário  
Inclui: VeiculoView – Exibe menus e informações  

---

## 💡 Exemplos de Uso

### 🎯 Cenário Típico
1. Cadastro de Marca: Volkswagen  
2. Cadastro de Modelo: Gol Trend (associado à Volkswagen)  
3. Cadastro de Cliente: João Silva  
4. Cadastro de Veículo: ABC-1234 (associado ao Gol Trend e João Silva)  
5. Consulta: Buscar veículo por placa e visualizar todos os detalhes  

### 📝 Exemplo de Saída
=== DETALHES DO VEÍCULO ===  
Placa: ABC1234  
Proprietário: João Silva  
Celular: (11) 99999-9999  
Email: joao@email.com  
Cor: Branco  
Modelo: Gol Trend  
Marca: Volkswagen  
Categoria: PEQUENO  
Potência: 100cv  
Combustível: FLEX  

---

## 🔄 Fluxo de Dados
1. Usuário interage com a View  
2. View envia comandos para o Controller  
3. Controller manipula os Models  
4. Models notificam mudanças  
5. View atualiza a exibição  

---

## 🚦 Próximas Melhorias Possíveis
- Persistência em banco de dados  
- Interface gráfica (JavaFX/Swing)  
- Sistema de login e usuários  
- Relatórios em PDF/Excel  
- API REST para integração  
- Sistema de agendamento de manutenção  
- Controle de IPVA e licenciamento  

---

## 🐛 Solução de Problemas

❌ Erro: "VeiculoController not found"  
Solução: Verificar imports e estrutura de packages  
import com.mycompany.maonamassa3.controller.VeiculoController;  

❌ Erro: "Package does not exist"  
Solução: Compilar todos os arquivos juntos  
javac -d bin src/com/mycompany/maonamassa3/**/*.java  


