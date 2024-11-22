def solution(numer1, denom1, numer2, denom2):


  top = numer1 * denom2 + numer2 * denom1  # 분자
  bottom = denom1 * denom2  # 분모


  def gcd(a, b):  # 최대공약수 구하는 함수 (유클리드 호제법)
    while b:
      a, b = b, a % b
    return a

  g = gcd(top, bottom) 
  return [top // g, bottom // g] 


print(solution(1, 2, 3, 4))
print(solution(9, 2, 1, 3)) 