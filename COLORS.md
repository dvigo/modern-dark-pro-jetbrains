# Modern Dark Pro for JetBrains - Color Palette

## Overview

Modern Dark Pro offers two carefully crafted color palettes optimized for JetBrains IDEs. Both variants provide excellent readability and minimal eye strain during extended coding sessions.

## Modern Dark Pro - Monokai

A vibrant, professional color scheme inspired by the classic Monokai theme with modern refinements.

### Background & Text Colors

| Element | Hex Color | RGB | Purpose |
|---------|-----------|-----|---------|
| Background | `#1e1e2e` | 30, 30, 46 | Primary editor background |
| Foreground | `#d4d4d4` | 212, 212, 212 | Default text color |
| Line Highlight | `#2d2d3d` | 45, 45, 61 | Current line background |

### Syntax Colors

| Element | Hex Color | RGB | Purpose |
|---------|-----------|-----|---------|
| Keywords | `#f92672` | 249, 38, 114 | Language keywords (if, while, etc.) |
| Strings | `#e6db74` | 230, 219, 116 | String literals |
| Numbers | `#ae81ff` | 174, 129, 255 | Numeric literals |
| Functions | `#e1a6f2` | 225, 166, 242 | Function/method names |
| Classes | `#79b8ff` | 121, 184, 255 | Class definitions |
| Constants | `#a6e22e` | 166, 226, 46 | Constants and static fields |
| Comments | `#75715e` | 117, 113, 94 | Code comments |

### UI Colors

| Element | Hex Color | RGB | Purpose |
|---------|-----------|-----|---------|
| Primary Blue | `#58a6ff` | 88, 166, 255 | Selection, highlights, focus |
| Success Green | `#3fb950` | 63, 185, 80 | Added lines, success states |
| Warning Orange | `#d29922` | 210, 153, 34 | Modified lines, warnings |
| Error Red | `#f85149` | 248, 81, 73 | Errors, deleted lines |
| Purple Accent | `#d2a8ff` | 210, 168, 255 | Special elements |

## Modern Dark Pro - Night

A sophisticated, subtle color scheme optimized for extended coding sessions in low-light environments.

### Background & Text Colors

| Element | Hex Color | RGB | Purpose |
|---------|-----------|-----|---------|
| Background | `#0d1117` | 13, 17, 23 | Primary editor background |
| Foreground | `#c9d1d9` | 201, 209, 217 | Default text color |
| Line Highlight | `#161b22` | 22, 27, 34 | Current line background |

### Syntax Colors

| Element | Hex Color | RGB | Purpose |
|---------|-----------|-----|---------|
| Keywords | `#ff7b72` | 255, 123, 114 | Language keywords (if, while, etc.) |
| Strings | `#a5d6ff` | 165, 214, 255 | String literals |
| Numbers | `#79c0ff` | 121, 192, 255 | Numeric literals |
| Functions | `#a371f7` | 163, 113, 247 | Function/method names |
| Classes | `#1f6feb` | 31, 110, 251 | Class definitions |
| Constants | `#238636` | 35, 134, 54 | Constants and static fields |
| Comments | `#6e7681` | 110, 118, 129 | Code comments |

### UI Colors

| Element | Hex Color | RGB | Purpose |
|---------|-----------|-----|---------|
| Subtle Blue | `#1f6feb` | 31, 110, 251 | Selection, highlights, focus |
| Muted Green | `#238636` | 35, 134, 54 | Added lines, success states |
| Muted Orange | `#8b7500` | 139, 117, 0 | Modified lines, warnings |
| Muted Red | `#da3633` | 218, 54, 51 | Errors, deleted lines |
| Muted Purple | `#6e40aa` | 110, 64, 170 | Special elements |

## Color Philosophy

Both palettes follow these design principles:

### Contrast & Readability

- **WCAG AA Compliance**: All colors meet minimum contrast ratios
- **Syntax Distinction**: Different color for each syntax element type
- **Visual Hierarchy**: Important elements stand out

### Monokai Variant

- **Vibrant Accent Colors**: Bold, energetic color scheme
- **High Contrast**: Maximum distinction between elements
- **Familiar Aesthetic**: Inspired by the classic Monokai theme
- **Best for**: Developers who prefer vibrant, high-contrast themes

### Night Variant

- **Subtle Tones**: Refined, professional colors
- **Low Blue Light**: Reduced eye strain in low-light environments
- **Reduced Saturation**: Gentler on extended viewing
- **Best for**: Extended coding sessions, night development

## Language-Specific Color Assignments

### Java / Kotlin

| Element | Color | Hex |
|---------|-------|-----|
| Keywords (public, class, etc.) | Keywords | `#f92672` / `#ff7b72` |
| Class names | Classes | `#79b8ff` / `#1f6feb` |
| Methods | Functions | `#e1a6f2` / `#a371f7` |
| Variables | Default | `#d4d4d4` / `#c9d1d9` |
| Strings | Strings | `#e6db74` / `#a5d6ff` |
| Numbers | Numbers | `#ae81ff` / `#79c0ff` |

### Python

| Element | Color | Hex |
|---------|-------|-----|
| Keywords (def, class, if, etc.) | Keywords | `#f92672` / `#ff7b72` |
| Class definitions | Classes | `#79b8ff` / `#1f6feb` |
| Function definitions | Functions | `#e1a6f2` / `#a371f7` |
| Built-in functions | Functions | `#e1a6f2` / `#a371f7` |
| Strings | Strings | `#e6db74` / `#a5d6ff` |
| Numbers | Numbers | `#ae81ff` / `#79c0ff` |

### JavaScript / TypeScript

| Element | Color | Hex |
|---------|-------|-----|
| Keywords | Keywords | `#f92672` / `#ff7b72` |
| Class/Interface names | Classes | `#79b8ff` / `#1f6feb` |
| Function names | Functions | `#e1a6f2` / `#a371f7` |
| Template strings | Strings | `#e6db74` / `#a5d6ff` |
| Numbers | Numbers | `#ae81ff` / `#79c0ff` |
| JSX tags | Keywords | `#f92672` / `#ff7b72` |

## Customization

To create your own variant:

1. Copy an existing theme file
2. Modify colors in the `<value>` elements
3. Change the `name` attribute to your theme name
4. Test in your IDE
5. Submit as a pull request or use locally

## Accessibility

All color combinations have been tested for:

- **WCAG AA Compliance**: 4.5:1 contrast for normal text
- **Color Blindness**: Distinct hues beyond just lightness
- **Eye Strain**: Optimized for extended viewing

For accessibility concerns or suggestions, please open an [issue](https://github.com/dvigo/modern-dark-pro-jetbrains/issues).

## References

- [WCAG Color Contrast Guidelines](https://www.w3.org/WAI/WCAG21/Understanding/contrast-minimum.html)
- [Color Universal Design](https://jfly.uni-koeln.de/color/)
- [JetBrains Color Scheme Documentation](https://plugins.jetbrains.com/docs/intellij/color-scheme.html)

---

**Modern Dark Pro** - Carefully Crafted Colors for Professional Development 🎨
