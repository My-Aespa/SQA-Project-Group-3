from abc import ABC, abstractmethod

class MenuItem(ABC):
    @abstractmethod
    def serve(self):
        pass