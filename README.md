# PackageAssignment
MobiquityInc Coding Assignment

# Approach

The main strategy is to find a solution knapsack problem with decimal weights.


# Requirement

You want to send your friend a package with different things.
Each thing you put inside the package has such parameters as index number, weight and cost. The
package has a weight limit. Your goal is to determine which things to put into the package so that the
total weight is less than or equal to the package limit and the total cost is as large as possible.
You would prefer to send a package which weighs less in case there is more than one package with the
same price.

# Sample input

Your API should accept as its first argument a path to a filename. The input file contains several lines.
Each line is one test case.
Each line contains the weight that the package can take (before the colon) and the list of items you need
to choose. Each item is enclosed in parentheses where the 1st number is a item’s index number, the 2nd
is its weight and the 3rd is its cost. E.g.
<code>
81 : (1,53.38,€45) (2,88.62,€98) (3,78.48,€3) (4,72.30,€76) (5,30.18,€9)
(6,46.34,€48)
8 : (1,15.3,€34)
75 : (1,85.31,€29) (2,14.55,€74) (3,3.98,€16) (4,26.24,€55) (5,63.69,€52)
(6,76.25,€75) (7,60.02,€74) (8,93.18,€35) (9,89.95,€78)
</code>
# Sample output

<p>The solution for each test case should be printed out on a single line. On this line you should list the item numbers of the individual items to be put in the package to solve the problem. The numbers should be separated by commas. If no combination of items matches the requirements, the output should be a single <code>-</code>.</p>
<p>The sample output for the sample input file above should look like this:</p>
<pre><code>4
-
2,7
8,9
</code>

