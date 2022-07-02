# Array Implementation of stack

def create_stack():
    stack = []
    return stack

def check_empty(self):
    return len(stack) == 0

def push(stack, item):
    stack.append(item)
    print("pushed item : " + item)

def pop(stack):
    if(check_empty(stack)):
        return "Stack is empty"
    return stack.pop()

stack = create_stack()
push(stack, str(1))
push(stack, str(78))
push(stack, str(89))
push(stack, str(69))
push(stack, str(55))

print("Popped item : " + pop(stack))
print("After popping:" + str(stack))