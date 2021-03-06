class Solution
{
    public boolean isUpper(char x)
    {
        return 'a' <= x && x <= 'z';
    }

    public char toLower(char x)
    {
        return (char) ((int)x - 32);
    }

    public String toLowerCase(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(char x : str.toCharArray())
        {
            sb.append(isUpper(x) ? toLower(x) : x);   
        }

        return sb.toString();
    }
}
