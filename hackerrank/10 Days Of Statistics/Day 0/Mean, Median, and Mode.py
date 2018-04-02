def mean(input_list):
    sum_all = 0
    for value in input_list:
        sum_all += value
    return sum_all / len(input_list)


def median(input_list):
    if len(input_list) < 1:
            return None
    if len(input_list) % 2 == 1:
            return sorted(input_list)[len(input_list)//2]
    else:
            return sum(sorted(input_list)[len(input_list)//2-1:len(input_list)//2+1])/2.0


def mode(input_list):
    dic = {}
    for value in input_list:
        if value in dic:
            dic[value] += 1
        else:
            dic[value] = 1
    tmp = (list(dic.keys())[0], dic.get(list(dic.keys())[0]))
    for key in dic:
        if dic[key] > tmp[1]:
            tmp = (key, dic[key])
        if dic[key] == tmp[1] and key < tmp[0]:
            tmp = (key, dic[key])
    return tmp[0]


n = int(input())
test = [int(token) for token in input().split()]
print('{}\n{}\n{}'.format(mean(test), median(test), (mode(test))))