function solution(participant, completion) {
  const map = new Map();

  // 참가자 +1
  for (const p of participant) {
    map.set(p, (map.get(p) || 0) + 1);
  }

  // 완주자 -1
  for (const c of completion) {
    map.set(c, map.get(c) - 1);
  }

  // 값이 남아있는 사람 찾기
  for (const [key, value] of map.entries()) {
    if (value > 0) {
      return key;
    }
  }
    
}