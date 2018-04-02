def quartile(input_array):
    input_array.sort()
    result = []
    l = len(input_array)
    median(input_array[0:int(l/2)], result)
    median(input_array, result)
    if l%2 == 0:
        median(input_array[int(l / 2):l], result)
    else:
        median(input_array[int(l / 2) + 1:l], result)
    return result


def median(input_array, result):
    if len(input_array) % 2 == 0:
        result.append(int(
            (input_array[int(len(input_array)/2)] + input_array[int(len(input_array)/2) - 1])/2
        ))
    else:
        result.append(input_array[int(len(input_array)/2)])


n = input()
X = [int(value) for value in input().split()]
print('\n'.join(str(value) for value in quartile(X)))