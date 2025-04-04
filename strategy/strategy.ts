class Context {
  private strategy: Strategy;

  constructor(strategy: Strategy) {
    this.strategy = strategy;
  }

  setStrategy(strategy: Strategy) {
    this.strategy = strategy;
  }

  executeStrategy(data: any): any {
    return this.strategy.execute(data);
  }
}

interface Strategy {
  execute(data: any): any;
}

class ConcreteStrategyA implements Strategy {
  execute(data: any): any {
    // Implementation for strategy A
    return `ConcreteStrategyA executed with ${data}`;
  }
}

class ConcreteStrategyB implements Strategy {
  execute(data: any): any {
    // Implementation for strategy B
    return `ConcreteStrategyB executed with ${data}`;
  }
}

// Example usage
const context = new Context(new ConcreteStrategyA());
console.log(context.executeStrategy("some data")); // ConcreteStrategyA executed with some data
context.setStrategy(new ConcreteStrategyB());
console.log(context.executeStrategy("some data")); // ConcreteStrategyB executed with some data
