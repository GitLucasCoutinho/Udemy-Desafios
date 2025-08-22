graph TD
    A[Usuário] --> B[Service Layer<br>com.project.tdd.comercio.service]
    B --> C[Model Layer<br>com.project.tdd.comercio.model]
    B --> D[Repository Layer<br>com.project.tdd.comercio.repository]
    D --> E[Base de Dados (simulada ou real)]

    subgraph Testes
        T1[Testes Unitários]
        T2[100% Cobertura<br>JaCoCo]
    end

    T1 --> B
    T1 --> C
    T1 --> D
    T2 --> T1
