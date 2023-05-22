class TotalAmountOfPoints {

    fun points(matchesResult: List<String>): Int {

        var team1FinalScore = 0
        matchesResult.map {
            var matchResult = it.split(":")
            val scoreTeam1 = matchResult[0].toInt()
            val scoreTeam2 = matchResult[1].toInt()
            team1FinalScore += Match(scoreTeam1, scoreTeam2).getTeam1Points()
        }

        return team1FinalScore
    }

    data class Match(val scoreTeam1: Int, val scoreTeam2: Int) {
        fun getTeam1Points(): Int {
            if (scoreTeam1 > scoreTeam2) return 3
            if (scoreTeam1 < scoreTeam2) return 0
            return 1
        }
    }
}