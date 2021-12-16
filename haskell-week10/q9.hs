myMap :: (a->b) -> [a] -> [b]
myMap f xs = foldr (\x y -> (f x) : y) [] xs