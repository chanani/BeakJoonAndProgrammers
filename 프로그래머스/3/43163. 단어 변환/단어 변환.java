import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int n = words.length;
        Deque<Word> queue = new ArrayDeque<>();
        queue.offer(new Word(begin, 0));
        boolean[] visited = new boolean[n];
        
        while(!queue.isEmpty()) {
            Word cur = queue.poll();
            String curWord = cur.getWord();
            int count = cur.getCount();
            
            for(int i = 0; i < n; i++) {
                if(!visited[i] && convertWord(words[i], curWord)) {
                    if(target.equals(words[i])) {
                        return count + 1;
                    }
                    queue.offer(new Word(words[i], count + 1));
                    visited[i] = true;
                }
            }
        }
        
        return answer;
    }
    
    // 단어가 딱 1개만 다른지 확인
    private boolean convertWord(String word, String begin) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.substring(i, i + 1).equals(begin.substring(i, i + 1))){
                count++;
            }
        }
        
        if(word.length() == count + 1){
            return true;
        }
        return false;
    }
    
    class Word {
        private String word;
        private int count;
        
        public Word (String word, int count){
            this.word = word;
            this.count = count;
        }
        
        public String getWord(){
            return this.word;
        }
        
        public int getCount() {
            return this.count;
        }
    }
}