# Modern Dark Pro for JetBrains - Development Guide

## Project Structure

```
modern-dark-pro-jetbrains/
├── colors/                          # Theme color scheme files
│   ├── Modern_Dark_Pro_Dracula.xml
│   ├── Modern_Dark_Pro_Monokai.xml
│   └── Modern_Dark_Pro_Night.xml
├── README.md                        # Project documentation
├── CHANGELOG.md                     # Version history
├── CONTRIBUTING.md                  # Contributing guidelines
├── DEVELOPMENT.md                   # This file
├── COLORS.md                        # Color palette documentation
└── LICENSE                          # MIT License
```

## Theme File Format

JetBrains uses XML-based color schemes. Each theme file contains:

### Basic Structure

```xml
<?xml version="1.0" encoding="UTF-8"?>
<scheme name="Theme Name" version="142" parent_scheme="Darcula">
  <metaInfo>
    <!-- Metadata about the theme -->
  </metaInfo>
  
  <colors>
    <!-- Global IDE colors -->
  </colors>
  
  <attributes>
    <!-- Editor and UI element colors -->
  </attributes>
</scheme>
```

### Key Attributes

- `name` - Display name of the theme
- `version` - Schema version (142 for recent IDEs)
- `parent_scheme` - Parent theme to inherit from
- `metaInfo` - Theme metadata
- `colors` - Global colors for UI elements
- `attributes` - Editor syntax highlighting colors

## Color Configuration

### Global Colors

Common global color options:
- `CARET_ROW_COLOR` - Current line highlight
- `CONSOLE_BACKGROUND_KEY` - Console background
- `GUTTER_BACKGROUND` - Line number gutter background
- `NOTIFICATION_BACKGROUND` - Notification popups
- `SELECTED_TEARLINE_COLOR` - Selected text indicator

### Editor Attributes

Key syntax highlighting attributes:
- `DEFAULT_ATTRIBUTE` - Default text
- `KEYWORD` - Language keywords
- `STRING` - String literals
- `NUMBER` - Numeric literals
- `LINE_COMMENT` - Comment text
- `FUNCTION_CALL` - Function calls
- `CLASS_NAME` - Class definitions
- `CONSTANT_NAME` - Constants
- `ERRORS_ATTRIBUTES` - Error highlighting
- `WARNING_ATTRIBUTES` - Warning highlighting

## Installation for Development

### macOS

```bash
mkdir -p ~/Library/Application\ Support/JetBrains/IntelliJIdea2024.1/colors/
cp colors/*.xml ~/Library/Application\ Support/JetBrains/IntelliJIdea2024.1/colors/
```

### Linux

```bash
mkdir -p ~/.config/JetBrains/IntelliJIdea2024.1/colors/
cp colors/*.xml ~/.config/JetBrains/IntelliJIdea2024.1/colors/
```

### Windows

```cmd
mkdir %APPDATA%\JetBrains\IntelliJIdea2024.1\colors
copy colors\*.xml %APPDATA%\JetBrains\IntelliJIdea2024.1\colors\
```

## Testing

### Before Submitting Changes

1. **Copy theme files** to your IDE's colors directory
2. **Restart IDE** completely
3. **Select theme** in Settings/Preferences → Appearance → Theme
4. **Test syntax highlighting** for multiple languages:
   - Java
   - Python
   - JavaScript/TypeScript
   - SQL
   - HTML/CSS
   - XML/JSON
5. **Verify colors** for:
   - Syntax elements (keywords, strings, numbers, etc.)
   - Error/warning highlighting
   - Search results
   - Line numbers and gutter
   - Selection/cursor line
   - Comments
6. **Test on multiple IDEs** (if possible):
   - IntelliJ IDEA
   - PyCharm
   - WebStorm
   - PhpStorm
   - etc.

### Contrast Verification

Use tools to verify WCAG AA compliance:
- [WebAIM Contrast Checker](https://webaim.org/resources/contrastchecker/)
- Minimum ratio: 4.5:1 for normal text, 3:1 for large text

## Color Palette Reference

### Modern Dark Pro - Monokai

```
Primary Background:    #1e1e2e
Primary Foreground:    #d4d4d4
Primary Blue:          #58a6ff
Success Green:         #3fb950 / #a6e22e
Warning Orange:        #d29922
Error Red:             #f85149
Purple Accent:         #d2a8ff / #ae81ff
```

### Modern Dark Pro - Night

```
Primary Background:    #0d1117
Primary Foreground:    #c9d1d9
Subtle Blue:           #1f6feb
Muted Green:           #238636
Muted Orange:          #8b7500
Muted Red:             #da3633
Muted Purple:          #6e40aa
```

### Modern Dark Pro - Dracula

```
Primary Background:    #282a36
Primary Foreground:    #f8f8f2
Selection/Accent:      #bd93f9
Success Green:         #50fa7b
Warning Orange:        #ffb86c
Error Red:             #ff5555
Muted Blue/Comments:   #6272a4
```

## Git Workflow

1. **Create feature branch**
   ```bash
   git checkout -b feature/theme-improvement
   ```

2. **Make changes** to color scheme files

3. **Test thoroughly** in your IDE

4. **Commit changes**
   ```bash
   git commit -m "Improve syntax highlighting for Python"
   ```

5. **Push to GitHub**
   ```bash
   git push origin feature/theme-improvement
   ```

6. **Open Pull Request** with description

## Common Tasks

### Adding a New Theme Variant

1. Create new XML file in `colors/` directory
2. Use existing theme as template
3. Modify color values
4. Test in IDE
5. Update CHANGELOG.md
6. Submit PR

### Updating Existing Colors

1. Edit the `.xml` file in `colors/`
2. Modify color hex values in `<value option="FOREGROUND" value="#XXXXXX" />`
3. Restart IDE to see changes
4. Test syntax highlighting for all languages
5. Update CHANGELOG.md
6. Submit PR

### Adding Documentation

- Edit `.md` files as needed
- Use clear, concise language
- Include code examples where helpful
- Link to relevant sections

## Resources

- [JetBrains Plugin Development](https://plugins.jetbrains.com/)
- [Color Scheme Documentation](https://plugins.jetbrains.com/docs/intellij/color-scheme.html)
- [WCAG Color Contrast Guidelines](https://www.w3.org/WAI/WCAG21/Understanding/contrast-minimum.html)
- [JetBrains IDE Color Scheme File Format](https://plugins.jetbrains.com/docs/intellij/color-scheme.html#plugin)

## Need Help?

- Check existing [issues](https://github.com/dvigo/modern-dark-pro-jetbrains/issues)
- Read [CONTRIBUTING.md](CONTRIBUTING.md)
- Open a new [discussion](https://github.com/dvigo/modern-dark-pro-jetbrains/discussions)
- Create an [issue](https://github.com/dvigo/modern-dark-pro-jetbrains/issues) with detailed information

---

Happy theme development! 🎨✨
