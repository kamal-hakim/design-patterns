from abc import ABC, abstractmethod

class Context():
    """
    Context class to manage the strategy.
    """
    def __init__(self, strategy):
        self.strategy = strategy

    def execute_strategy(self, data):
        return self.strategy.execute(data)

class Strategy(ABC):
    """
    Abstract base class for strategies.
    """
    @abstractmethod
    def execute(self, data):
        """
        Execute the strategy on the given data.
        """
        pass
    
class ConcreteStrategyA(Strategy):
    """
    Concrete strategy A implementation.
    """
    def execute(self, data):
        # Implementation for strategy A
        return f"Strategy A executed with data: {data}"

class ConcreteStrategyB(Strategy):
    """
    Concrete strategy B implementation.
    """
    def execute(self, data):
        # Implementation for strategy B
        return f"Strategy B executed with data: {data}"
    
if __name__ == "__main__":
    # Example usage
    data = "sample data"
    
    # Using strategy A
    strategy_a = ConcreteStrategyA()
    context_a = Context(strategy_a)
    result_a = context_a.execute_strategy(data)
    print(result_a)  # Output: Strategy A executed with data: sample data
    
    # Using strategy B
    strategy_b = ConcreteStrategyB()
    context_b = Context(strategy_b)
    result_b = context_b.execute_strategy(data)
    print(result_b)  # Output: Strategy B executed with data: sample data