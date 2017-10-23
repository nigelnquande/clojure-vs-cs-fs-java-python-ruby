# less than a minute for each of the Python versions (imperative/functional)
# 14 minutes of looking at https://docs.python.org/3/howto/functional.html for the iterator version, 2 minutes of same for filter version

# imperative
def i ():
  nums = [1, 2, 3, 4, 5]
  print nums[:2] + nums[3:]
  
# Functional
def is_allowed (x):
  return x > 0 and x != 3
  
def f ():
  return list(filter(is_allowed, range(6)))


if __name__ == "__main__":
  i()
  print(f())
