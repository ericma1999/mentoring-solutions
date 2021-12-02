import Data.Char




-- capitalised :: String -> String
-- capitalised [] = []
-- capitalised string = [toUpper(head(string))] ++ (map toLower (tail(string))) 
-- capitalised (x:xs) = toUpper x: [toLower x | x <- xs]


lowercase :: String -> String
lowercase [] = []
lowercase (x:xs) = toLower x: lowercase xs



capitalised :: String -> String
capitalised (x:xs) = toUpper x : lowercase xs





-- if length of word > 3 we capitalised
-- 

capitalisedLong :: String -> String
capitalisedLong [] = []
capitalisedLong word | length word > 3 = capitalised word
                      | otherwise = lowercase word

titleCapitalised :: [String] -> [String]
titleCapitalised [] = []
titleCapitalised (x : xs) = (capitalisedLong x) : (titleCapitalised xs)


title :: [String] -> [String]
title [] = []
title (x : xs) = (capitalised x) : (titleCapitalised xs)



title ["and", "bOSun", "ANd", "thE", "BriDGe"]