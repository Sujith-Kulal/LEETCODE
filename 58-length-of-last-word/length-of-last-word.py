class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        # Simplified by using strip and split to remove duplicate loop patterns
        s = s.strip()
        if not s:
            return 0
        words = s.split()
        return len(words[-1]) if words else 0