package com.michau.hltvclone.admin;

import com.michau.hltvclone.event.EventMapper;
import com.michau.hltvclone.event.EventRepository;
import com.michau.hltvclone.event.model.EventRequest;
import com.michau.hltvclone.event.model.EventResponse;
import com.michau.hltvclone.map.MapRepository;
import com.michau.hltvclone.match.MatchRepository;
import com.michau.hltvclone.news.NewsRepository;
import com.michau.hltvclone.player.PlayerRepository;
import com.michau.hltvclone.result.ResultRepository;
import com.michau.hltvclone.team.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;
    private final MapRepository mapRepository;
    private final MatchRepository matchRepository;
    private final NewsRepository newsRepository;
    private final PlayerRepository playerRepository;
    private final ResultRepository resultRepository;
    private final TeamRepository teamRepository;

    public EventResponse addEvent(EventRequest eventRequest) {
        var event = eventRepository.save(eventMapper.toEvent(eventRequest));
        return eventMapper.toResponse(event);
    }


}
