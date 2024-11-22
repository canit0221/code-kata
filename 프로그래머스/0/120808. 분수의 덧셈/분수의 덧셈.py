def solution(numer1, denom1, numer2, denom2):
  """
  두 분수를 더하고 기약분수로 만드는 함수입니다.
  """
  # 1. 분수 더하기: 분모는 곱하고, 분자는 분모끼리 곱한 값을 곱해서 더해요.
  top = numer1 * denom2 + numer2 * denom1  # 분자
  bottom = denom1 * denom2  # 분모

  # 2. 기약분수 만들기: 최대공약수로 분자와 분모를 나눠요.
  def gcd(a, b):  # 최대공약수 구하는 함수 (유클리드 호제법)
    while b:
      a, b = b, a % b
    return a

  g = gcd(top, bottom)  # 분자와 분모의 최대공약수
  return [top // g, bottom // g]  # 기약분수 (분자, 분모)

# 예시
print(solution(1, 2, 3, 4))  # 출력: [5, 4]
print(solution(9, 2, 1, 3))  # 출력: [29, 6]