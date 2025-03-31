# Exchange Rate Calculator with Spring DI

This project demonstrates the use of Spring's Dependency Injection (DI) in creating an exchange rate calculator. Different DI approaches, including XML-based, annotation-based, Java configuration, and Hasa implementation, were applied to manage object dependencies and perform currency conversion.

## Features
- Converts **KRW (Korean Won)** to **AUD (Australian Dollar)**.
- Uses Spring DI to manage dependencies between classes.
- Demonstrates different DI approaches (XML, annotation, Java configuration) within a Spring application.

## DI Approaches Implemented
1. **XML-based DI**
   - Defined beans and injected dependencies through an XML configuration file (`all-exch.xml`).
   
2. **Annotation-based DI**
   - Used Spring annotations like `@Component`, `@Autowired`, and `@Qualifier` to register beans and inject dependencies directly into the classes.
   
3. **Java Configuration-based DI**
   - Configured beans and injected dependencies programmatically using Java-based configuration (`@Configuration` and `@Bean` annotations).
   
4. **Hasa Exchange Implementation**
   - The `HasaExchange` class encapsulates the exchange rate logic, allowing for easy extension or modification of the conversion process.

### Example Output:
10000 KRW = 9.8 AUD
