# less than a minute for the Python version
# 14 minutes of looking at https://docs.python.org/3/howto/functional.html for the iterator version

# imperative
def i ():
  nums = [1, 2, 3, 4, 5]
  print nums[:2] + nums[3:]
  
def f ():
  print([i for i in (1, 2, 3, 4, 5) if i != 3])


if __name__ == "__main__":
  i()
  f()
