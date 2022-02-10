nameMap = ["서울": "Seoul", "인천": "Incheon", "광주": "Gwangju"]
println nameMap["인천"] //변수.[키] 형태로 값 추출 result=Incheon
println nameMap.서울    //변수.키 형태로 값 추출
nameMap.인천 = "inCheon"    //맵의 값 변경
emptyMap = [:]  //빈 맵 생성