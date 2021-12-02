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






-- Always the first word capitalised
-- following words if length of word > 3 we capitalised if not lower it

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

-- list imperative solution
-- title list = [if (length x > 3 || x == head list) then capitalised x else lowercase x |x <- list]



title ["and", "bOSun", "ANd", "thE", "BriDGe"]