# code/client.py

def order_beverage(factory):
    beverage = factory.create_beverage()
    return beverage.prepare()

def order_pastry(factory):
    pastry = factory.create_pastry()
    return pastry.bake()

def order_snack(factory):
    snack = factory.create_snack()
    return snack.serve()
