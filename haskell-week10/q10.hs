-- Define length using foldr only and call it myLength’.

myLength' :: [a] -> Int
myLength' [] = 0
myLength' xs = foldr (\_ y -> y + 1) 0 xs