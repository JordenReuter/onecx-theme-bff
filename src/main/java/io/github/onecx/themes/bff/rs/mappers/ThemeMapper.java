package io.github.onecx.themes.bff.rs.mappers;

import org.mapstruct.Mapper;
import org.tkit.quarkus.rs.mappers.OffsetDateTimeMapper;

import gen.io.github.onecx.theme.bff.clients.model.CreateTheme;
import gen.io.github.onecx.theme.bff.clients.model.Theme;
import gen.io.github.onecx.theme.bff.clients.model.UpdateTheme;
import gen.io.github.onecx.theme.bff.rs.internal.model.ThemeDTO;
import gen.io.github.onecx.theme.bff.rs.internal.model.ThemeUpdateCreateDTO;

@Mapper(uses = { OffsetDateTimeMapper.class })
public interface ThemeMapper {

    UpdateTheme mapUpdate(ThemeUpdateCreateDTO dto);

    CreateTheme mapCreate(ThemeUpdateCreateDTO dto);

    ThemeDTO map(Theme theme);

}
