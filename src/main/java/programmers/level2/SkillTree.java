package programmers.level2;

public class SkillTree {
    public static void main(String[] args) {
        // 프로그래머스 level2 스킬트리

        System.out.println(solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }

    public static int solution(String skill,String[] skill_trees){
        String[] precedence=new String[skill_trees.length];
        int answer=0;

        for(int i=0;i< skill_trees.length;i++){
            String skill_tree = skill_trees[i];
            StringBuffer precedence_skill=new StringBuffer();
            for(int j=0;j<skill_tree.length();j++){
                if(skill.contains(Character.toString(skill_tree.charAt(j)))){
                    precedence_skill.append(skill_tree.charAt(j));
                }
            }
            precedence[i]=precedence_skill.toString();
        }

        for(int i=0;i< precedence.length;i++){
            System.out.println(precedence[i]);
            if(precedence[i].equals(skill.substring(0,precedence[i].length()))){
                answer++;
            }
        }
        return answer;
    }
}
